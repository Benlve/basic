package com.ben._03_socket._02_tcp_udp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP网络编程
 * <p>
 * 例子3：
 * 客户端发送文件给服务端，服务端接受并保存到本地，且反馈给客户端：已收到
 *
 * @Author 廖新平
 * @Date 2022/12/22 11:47
 */
public class Test2TCP {

    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        InputStream inputStream = null;
        try {
            //1.定位服务端（网络节点）
            InetAddress host = InetAddress.getByName("127.0.0.1");
            socket = new Socket(host, 9778);
            //2.获取输出流
            outputStream = socket.getOutputStream();
            //3.输出数据
            //读本地
            fileInputStream = new FileInputStream(new File("古镇.jpg"));
            //写出
            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }

            //客户端输出完毕，关闭输出的输出
            socket.shutdownOutput();

            inputStream = socket.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buffer2 = new byte[5];
            int len2;
            while((len2 = inputStream.read(buffer2)) != -1) {
                byteArrayOutputStream.write(buffer2,0,len2);
            }
            System.out.println(byteArrayOutputStream.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //服务端
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        OutputStream outputStream = null;
        try {
            //1.设定端口号
            serverSocket = new ServerSocket(9778);
            //2.接受客户端的socket
            accept = serverSocket.accept();
            //3.获取输入流
            inputStream = accept.getInputStream();
            //4.写出保存至本地
            fileOutputStream = new FileOutputStream(new File("古镇_socket.jpg"));
            byte[] buffer = new byte[5];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
            //反馈客户端
            outputStream = accept.getOutputStream();
            outputStream.write("已收到啦~".getBytes());
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
            if (accept != null) {
                try {
                    accept.close();
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
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
