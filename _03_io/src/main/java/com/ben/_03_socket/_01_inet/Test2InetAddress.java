package com.ben._03_socket._01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @Author 廖新平
 * @Date 2022/12/22 23:01
 */
public class Test2InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //通过String类型的ip地址，域名获取
        InetAddress address1 = InetAddress.getByName("192.168.2.6");
        InetAddress address2 = InetAddress.getByName("www.baidu.com");
        String hostAddress = address1.getHostAddress();
        String hostName = address1.getHostName();
        System.out.println(hostAddress);
        System.out.println(hostName);

        System.out.println("\n*********************************\n");

        //本机回路
        InetAddress localHost = InetAddress.getLocalHost();
        String hostAddress1 = localHost.getHostAddress();
        String hostName1 = localHost.getHostName();
        System.out.println(hostAddress1);
        System.out.println(hostName1);//设备名称

        InetAddress localHost2 = InetAddress.getByName("127.0.0.1");
        System.out.println(localHost2.getHostName());
        System.out.println(localHost2.getHostAddress());

        System.out.println(localHost.toString());//设备名称 + IP


    }
}
