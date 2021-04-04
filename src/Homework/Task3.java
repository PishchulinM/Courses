package Homework;

import java.util.Scanner;

public class Task3 {
    enum Error {
        Bad_Request,
        Unauthorized,
        Forbidden,
        Not_Found,
        Internal_Server_Error,
        Bad_Gateway,
        Service_Unavailable,
        Gateway_Timeout;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        switch (x) {
            case 400:
                System.out.println(Error.Bad_Request);
                break;
            case 401:
                System.out.println(Error.Unauthorized);
                break;
            case 403:
                System.out.println(Error.Forbidden);
                break;
            case 404:
                System.out.println(Error.Not_Found);
                break;
            case 500:
                System.out.println(Error.Internal_Server_Error);
                break;
            case 502:
                System.out.println(Error.Bad_Gateway);
                break;
            case 503:
                System.out.println(Error.Service_Unavailable);
                break;
            case 504:
                System.out.println(Error.Gateway_Timeout);
                break;
        }
    }
}

