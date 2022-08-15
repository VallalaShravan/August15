package com.coding.Program01;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class App {
	
	public static String encoding(String text) {
		Encoder encode= Base64.getEncoder();
		byte[] byteData = encode.encode(text.getBytes());
		return new String(byteData);
	}
	public static String decoding(String decodeText) {
		Decoder decoder = Base64.getDecoder();
		byte[] byteData = decodeText.getBytes();
		return new String(decoder.decode(byteData));
	}

}
