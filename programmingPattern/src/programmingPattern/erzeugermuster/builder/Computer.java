package programmingPattern.erzeugermuster.builder;

public class Computer {
	
	private String hdd;
	private String ram;
	
	private boolean hasGrafik;
	private boolean hasBluetooth;
	
	private Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.hasGrafik = builder.hasGrafik;
		this.hasBluetooth = builder.hasBluetooth;
		
	}
	
	
	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isHasGrafik() {
		return hasGrafik;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}



	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", hasGrafik=" + hasGrafik + ", hasBluetooth=" + hasBluetooth
				+ "]";
	}



	public static class ComputerBuilder{
		
		
		private String hdd;
		private String ram;
		
		private boolean hasGrafik;
		private boolean hasBluetooth;
		
		public ComputerBuilder(String hdd, String ram) {
			this.hdd= hdd;
			this.ram= ram;
		}
		
		public ComputerBuilder setGrafik(boolean hatGrafik) {
			this.hasGrafik = hatGrafik;
			return this;
		}
		
		public ComputerBuilder setBluetooth(boolean hatBluetooth) {
			this.hasBluetooth= hatBluetooth;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}
	
}

