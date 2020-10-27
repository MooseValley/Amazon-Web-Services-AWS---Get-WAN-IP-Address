/*
Simple example to use Amazon AWS to get my WAN IP Address using basic Java commands.

Amazon AWS is a huge and complex beast.  But some things
are really easy to do, like getting AWS to tell us what my
WAN IP address is.  i.e. get AWS to tell me what my IP address
appears to be from outside my local network.

Example Usage:
   System.out.println ("WAN IP: " + AmazonAwsGetWanIpAddress.getWanIPAddress ());

Sample output:
   WAN IP: 209.231.145.72

Moose

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;


public class AmazonAwsGetWanIpAddress
{
   public static String getWanIPAddress ()
   {
      String wanIPAddress = "unknown";

      try
      {
         // Use Amazon Web Services: this returns a single line - the WAN IP Address.
         URL url = new URL("http://checkip.amazonaws.com/");
         BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
         //System.out.println(br.readLine());

         wanIPAddress = br.readLine();
      }
      catch (IOException err)
      {
         err.printStackTrace();
         wanIPAddress = "Error: cannot determine WAN IP Address: " + err.toString();
      }

      return wanIPAddress;
   }


   public static void main (String[] args)
   {
      System.out.println("WAN IP: " + getWanIPAddress ());
   }

} // public class AmazonAwsGetWanIpAddress
