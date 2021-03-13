# IP-Address-Finder
Project: IP Address Finder GUI based using java language


In this project, I used three concept of java:
1.	 Java Swing
2.	Java awt Event
3.	Java networking
Let me tell you about IP address, URL Address and Networking Method to find IP address in this program.
 URL:
URL is an acronym for Uniform Resource Locator. It points to a resource on the World Wide Web. 
The user have to Enter URL to find IP address in this program.
Example of URL: www.Facebook.com , www.google.com , www.TempMail.com etc.

Let me show the Screenshot of This program: 
Java Networking:
         Java ‘ InetAddress class ‘ represents an IP address. The java.net.InetAddress class provides methods to get the IP of any host name. Additionally, ‘InetAddress’ has a cache mechanism to store successful and unsuccessful host name resolutions. 
Host examples: www.Instagram.com , www.google.com , www.facebook.com , etc. to find the IP address
             Main statements in this Program
// InetAddress get the IP of the Host or server
InetAddress iname = InetAddress.getByName(url);
//getHostAddress returns the instance of InetAddress containing IP address and Name of the Host
String ipadd = iname.getHostAddress();


Java awt Event and java swing:
Here I apply awt Event class to action on methods like clicking on button showing popup Message Dialog IP address.
Different class for different kind of work all are import from predefined packages provided by java developers.
In this program, I used “JFrame, JLabel, JButton, and JTextField”.
I create text Field, frame, label and button using java swing classes and color class of java swing. In addition, set their size, color, width and height by using their methods.
And apply actionPerform() method on frame to perform action in add button, text field , label and all such functions.
 Here are some Screenshots of program:
 
 






  ****************Must try this code****************
                 Thank You

