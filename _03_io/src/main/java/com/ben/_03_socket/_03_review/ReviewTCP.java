package com.ben._03_socket._03_review;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP网络编程
 * 客户端发送一句话，服务端接收并输出到控制台
 *
 * @Author 廖新平
 * @Date 2022/12/22 22:07
 */
public class ReviewTCP {

    //服务端
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //1.指定端口号，创建服务端socket
            int serverPort = 17945;
            serverSocket = new ServerSocket(serverPort);
            //2.拿到客户端的socket
            socket = serverSocket.accept();
            //3.获取输入流
            inputStream = socket.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);
            byteArrayOutputStream = new ByteArrayOutputStream();
            //4.读取过程
            byte[] buffer = new byte[5];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //客户端
    @Test
    public void client() {
        //通信数据
        String data = "来自客户端的数据：数据~~~";
        Socket socket = null;
        OutputStream outputStream = null;
//        BufferedOutputStream bufferedOutputStream = null;

        try {
            //1.创建socket
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int serverPort = 17945;
            socket = new Socket(serverIP, serverPort);
            //2.获取输出流
            outputStream = socket.getOutputStream();
//            bufferedOutputStream = new BufferedOutputStream(outputStream);
            //3.输出过程
            outputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
//            if (bufferedOutputStream != null) {
//                try {
//                    bufferedOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
