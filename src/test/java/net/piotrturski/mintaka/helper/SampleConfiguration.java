package net.piotrturski.mintaka.helper;

import net.piotrturski.mintaka.DefaultConfiguration;

public class SampleConfiguration extends DefaultConfiguration {

	@Override
	public Class<?>[] coercer() {
		return asArray(SecondCoercer.class);
	}
	
}
