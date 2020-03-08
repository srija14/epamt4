package Epam.task4;

public class Housecc {
	public double costCalculator(String standard_material_used,double area_of_house,String fully_automated_home) {
		double houseconstruction_cost=0;
		if(standard_material_used=="YES" && fully_automated_home=="NO") 
		{
			houseconstruction_cost=area_of_house*1200;
		}
		else if(standard_material_used=="ABOVE_STANDARD_MATERIAL" && fully_automated_home=="NO") 
		{
			houseconstruction_cost=area_of_house*1500;
		}
		else if(standard_material_used=="HIGH_STANDARD_MATERIAL" && fully_automated_home=="NO") 
		{
			houseconstruction_cost=area_of_house*1800;
		}
		else if(standard_material_used=="HIGH_STANDARD_MATERIAL" && fully_automated_home=="YES") 
		{
			houseconstruction_cost=area_of_house*2500;
		}
		return houseconstruction_cost;
	}

}
