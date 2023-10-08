package lab.lab_06;

public class CheckDomain {
     public static String getNetworkProtocol(String url){
         if(url.startsWith("https")) return "https";
         else return "http";
     }

    public static String getDomain(String url){
        if(url.endsWith(".net")) return ".net";
        else return ".com";
    }

    public static String getDetailUrl(String url){
         return "Network Protocol is " + getNetworkProtocol(url)+" and domain is "+getDomain(url);
    }

    public static void main(String[] args) {
        String url = "http://google.net";
        System.out.println(getDetailUrl(url));
    }
}
