package ipLocationFinder;

import java.util.Scanner;

import geoipservice.GeoIPService;
import geoipservice.GeoIPServiceSoap;
import geoipservice.GetIpLocation;

// Point here is to Query the UDDI to get the WSDL files
public class IPLocationFinder {
	public static void main(String args[]) {
		String ip = "172.217.9.142";
		if (args.length < 1){
			System.out.println("No WSDL Provided.");
		} else {
			ip = args[0];
			GeoIPService service = new GeoIPService();
			GeoIPServiceSoap soap = service.getGeoIPServiceSoap();
			// ^ This is our stub
			String loc = soap.getIpLocation(ip);
			System.out.println("ip=" + ip + " is in loc:\n" + loc);
		}
	}
}
