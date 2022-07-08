int flag = 0;

void setup()
{
	pinMode(0, OUTPUT);
	pinMode(7, INPUT);
}

void loop()
{
	int inputValue = digitalRead(7);
	
	if(inputValue == HIGH){
	}