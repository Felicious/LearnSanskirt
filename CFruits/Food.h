#ifndef FOOD_H
#define FOOD_H 

#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>

class Food {
	private: 
		std::string name;

	public:
		// constructor: sets name to food by default
		Food(){
			this->name = "food";

			std::cout << "Food " << 
			this->name << std::endl;

		}

		Food(std::string name){
			this->name = name;
		}

		void prepare(){
			std::cout << "Prepare the " << this->name << std::endl;
		}
}

#endif