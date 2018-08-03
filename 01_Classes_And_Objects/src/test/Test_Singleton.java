package test;

import beans.Network;

public class Test_Singleton {

	public static void main(String[] args) {

		Network network = Network.getInstance();
		network.connect();
	}
}
