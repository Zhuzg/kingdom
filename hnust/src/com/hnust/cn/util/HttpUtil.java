package com.hnust.cn.util;

import java.io.ByteArrayOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.io.UnsupportedEncodingException;  
import java.lang.annotation.Target;
import java.net.HttpURLConnection;  
import java.net.MalformedURLException;  
import java.net.URL;  
import java.net.URLEncoder;    
import java.util.HashMap;
import java.util.Map;  
 
  
public class HttpUtil {  
  
    private static final String PATH = "http://localhost:8080/hnust_server/";  
    private static URL url;  
//  //静态代码块实例化url  
//  static{  
//      try {  
//          url=new URL(PATH);  
//      } catch (MalformedURLException e) {  
//          // TODO Auto-generated catch block  
//          e.printStackTrace();  
//      }  
//  }  
    /*** 
     * 以post方式进行提交数据 
     * @param params 
     * @param encode 
     * @return 
     */  
    public static String sendPostMessgae(Map<String, String> params, String encode) {  
      
        StringBuilder builder=new StringBuilder();  
        if(params != null && !params.isEmpty()) {  
            for(Map.Entry<String, String> entry : params.entrySet()) {  
                try {  
                    builder.append(entry.getKey())  
                           .append("=")  
                           .append(URLEncoder.encode(entry.getValue(), encode))  
                           .append("&");  
                } catch (UnsupportedEncodingException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            builder.deleteCharAt(builder.length()-1);  
            HttpURLConnection urlConnection;  
            try {  
                url = new URL(PATH);  
                urlConnection = (HttpURLConnection) url.openConnection();  
                urlConnection.setConnectTimeout(3000);  
                urlConnection.setRequestMethod("POST");//以post方式提交  
                urlConnection.setDoInput(true);//读取数据  
                urlConnection.setDoOutput(true);//向服务器写数据  
                //获取上传信息的大小和长度  
                byte[] data = builder.toString().getBytes();  
                //设置请求的文本类型，表示当前提交的是文本数据  
                urlConnection.setRequestProperty("Content-type", "application/x-www-form-urlencode");  
                urlConnection.setRequestProperty("Content-length", String.valueOf(data.length));  
                //获得输出流，向服务器输出内容  
                OutputStream out = urlConnection.getOutputStream();  
                //写数据  
                out.write(data, 0, data.length);  
                out.close();  
                //获得服务器响应结果和状态码  
                int responseCode = urlConnection.getResponseCode();  
                if(responseCode == 200){  
                    //取出响应结果  
                    return inStream2String(urlConnection.getInputStream(), encode);  
                }  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
              
              
              
        }  
        return null;  
          
    }  
    /** 
     * 已get方式提交数据 
     * @param params 
     * @param encode 
     * @return 
     */  
    public static String sendGetMessage(Map<String, String> params,String encode) {  
        StringBuilder builder = new StringBuilder(PATH);  
        builder.append("?");  
        if(params != null && !params.isEmpty()){  
            for(Map.Entry<String, String> entry : params.entrySet()) {  
                try {  
                    builder.append(entry.getKey())  
                           .append("=")  
                           .append(URLEncoder.encode(entry.getValue(), encode))  
                           .append("&");  
                } catch (UnsupportedEncodingException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }  
        builder.deleteCharAt(builder.length()-1);  
        HttpURLConnection urlConnection;  
        try {  
            url=new URL(builder.toString());  
            urlConnection = (HttpURLConnection) url.openConnection();  
            urlConnection.setConnectTimeout(3000);  
            urlConnection.setRequestMethod("GET");//以post方式提交  
            urlConnection.setDoInput(true);//读取数据  
            urlConnection.setDoOutput(true);//向服务器写数据  
            //设置请求的文本类型，表示当前提交的是文本数据  
            urlConnection.setRequestProperty("Content-type", "application/x-www-form-urlencode");  
            int responseCode=urlConnection.getResponseCode();  
            if(responseCode==200){  
                //取出响应结果  
                return inStream2String(urlConnection.getInputStream(),encode);  
            }  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        return null;  
    }  
    //将输入流转换为输出流，获得字符串  
    @SuppressWarnings("unused")  
    private static String inStream2String(InputStream is, String encode) throws IOException{  
        ByteArrayOutputStream baos = new ByteArrayOutputStream();  
        byte[] buf = new byte[1024];  
        int len = -1;  
        while((len=is.read(buf)) != -1){  
            baos.write(buf, 0, len);  
        }  
          
        return new  String(baos.toByteArray(), encode);  //将byte数组变为字符串进行输出  
    }
    public static void main(String[] args) {
//		PATH = "http://localhost:8080/hnust_server/fund/getFundInfo.json";
    	
		Map<String, String> map = new HashMap<String, String>();
		map.put("fundCode", "80000000001");
		
		String test = HttpUtil.sendGetMessage(map, "UTF-8");
		System.out.println(test);
	}
}  
