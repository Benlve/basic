package com.ben._03_socket._02_tcp_udp;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP的网络编程
 *
 * 发送端和接受端不需要建立连接，系统不保证数据报是否抵达，也不保证什么时候抵达
 * @Author 廖新平
 * @Date 2022/12/22 12:21
 */
public class Test3UDP {

    public static final int port = 7368;

    //发送端
    @Test
    public void sender() {

        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();

            //data(byte类型)
            String data = "我是用UDP方式发送的数据：数据~";
            //IP和Port放入,data放入
            DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), 0,
                    data.getBytes().length, InetAddress.getLocalHost(),port);

            datagramSocket.send(datagramPacket);
            System.out.println("已发送至 IP：" + InetAddress.getLocalHost().getHostAddress() + ", Port : " + port);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //发送
            if(datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }

    //接受端
    @Test
    public void receiver() {
        DatagramSocket datagramSocket = null;
        DatagramPacket datagramPacket = null;
        try {
            datagramSocket = new DatagramSocket(port);
            byte[] buffer = new byte[100];
            datagramPacket = new DatagramPacket(buffer,0,buffer.length);
            datagramSocket.receive(datagramPacket);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(datagramSocket != null) {
                datagramSocket.close();
            }
        }

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();

        System.out.println("来自发送端的数据：" + new String(data,0,length));
    }


}
