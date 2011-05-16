package racetrack;

import org.codehaus.groovy.grails.plugins.codecs.SHA1Codec;

import grails.test.GrailsUnitTestCase;

class SHACodecTests extends GrailsUnitTestCase{

	void testEncode() {
		String encodedString = SHA1Codec.encode("test")
		System.out.println(encodedString);
		assertFalse(encodedString.equals("test"))
	}
	
}
