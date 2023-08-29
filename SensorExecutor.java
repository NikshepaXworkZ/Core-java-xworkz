class SensorExecutor{

	public static void main (String args[]){
	     
Sensor sensor=new Sensor();
sensor.sensorId=1;
sensor.sensorType="motion sensor";
sensor.battery="powered";
sensor.productPrice=599;
sensor.brand="quarax";
sensor.dimensionInmm=15;

sensor.provideDetection();
System.out.println("sensor id is "+sensor.sensorId);
System.out.println("Sensor type is "+sensor.sensorType); 
System.out.println("sensor battery type is"+sensor.battery);
System.out.println("sensor product price is "+sensor.productPrice);
System.out.println("sensor brand is "+sensor.brand);
System.out.println("sensor dimension in mm is "+sensor.dimensionInmm);

Sensor sensor1=new Sensor();
sensor1.sensorId=2;
sensor1.sensorType="wall mount";
sensor1.battery="poweredk";
sensor1.productPrice=789;
sensor1.brand="rushwak";
sensor1.dimensionInmm=9;

sensor1.provideDetection();
System.out.println("sensor id is "+sensor1.sensorId);
System.out.println("Sensor type is "+sensor1.sensorType); 
System.out.println("sensor battery type is"+sensor1.battery);
System.out.println("sensor product price is "+sensor1.productPrice);
System.out.println("sensor brand is "+sensor1.brand);
System.out.println("sensor dimension in mm is "+sensor1.dimensionInmm);

Sensor sensor2=new Sensor();
sensor2.sensorId=3;
sensor2.sensorType="automatic in night time";
sensor2.battery="energy efficient";
sensor2.productPrice=2959;
sensor2.brand="vrprime";
sensor2.dimensionInmm=20;

sensor2.provideDetection();
System.out.println("sensor id is "+sensor2.sensorId);
System.out.println("Sensor type is "+sensor2.sensorType); 
System.out.println("sensor battery type is"+sensor2.battery);
System.out.println("sensor product price is "+sensor2.productPrice);
System.out.println("sensor brand is "+sensor2.brand);
System.out.println("sensor dimension in mm is "+sensor2.dimensionInmm);

Sensor sensor3=new Sensor();
sensor3.sensorId=4;
sensor3.sensorType="bis";
sensor3.battery="cell";
sensor3.productPrice=1800;
sensor3.brand="medtronic";
sensor3.dimensionInmm=20;

sensor3.provideDetection();
System.out.println("sensor id is "+sensor3.sensorId);
System.out.println("Sensor type is "+sensor3.sensorType); 
System.out.println("sensor battery type is"+sensor3.battery);
System.out.println("sensor product price is "+sensor3.productPrice);
System.out.println("sensor brand is "+sensor3.brand);
System.out.println("sensor dimension in mm is "+sensor3.dimensionInmm);

Sensor sensor4=new Sensor();
sensor4.sensorId=5;
sensor4.sensorType="motion";
sensor4.battery="powered";
sensor4.productPrice=1995;
sensor4.brand="askon";
sensor4.dimensionInmm=150;

sensor4.provideDetection();
System.out.println("sensor id is "+sensor4.sensorId);
System.out.println("Sensor type is "+sensor4.sensorType); 
System.out.println("sensor battery type is"+sensor4.battery);
System.out.println("sensor product price is "+sensor4.productPrice);
System.out.println("sensor brand is "+sensor4.brand);
System.out.println("sensor dimension in mm is "+sensor4.dimensionInmm);

	}
}