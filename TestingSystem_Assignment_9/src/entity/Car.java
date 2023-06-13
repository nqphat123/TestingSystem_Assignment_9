package entity;

public class Car {
	@Override
	public String toString() {
		return "Car [name = " + name + ", type = " + type + "]";
	}

	private String name;
	private String type;
	
	public Car(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public class Engine{
		@Override
		public String toString() {
			return "Engine [engineType = " + engineType + "]";
		}

		private String engineType;

		public Engine(String engineType) {
			this.engineType = engineType;
		}
	
		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
	}
}
