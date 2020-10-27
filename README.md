# Amazon Web Services (AWS) - Get WAN IP Address

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
