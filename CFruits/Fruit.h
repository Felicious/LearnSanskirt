#ifndef FRUIT_H
#define FRUIT_H 
#include <time.h>
#include <string>
#include <iostream>
#include "Food.h"

class Fruit:public Food {
	private: 
		time_t ripe;

	public: 
		//function name == class name 
		// then is constructor!!!!!!
		Fruit(time_t r, std::string n){
			this->ripe = r;
			this->name = n;

			std::cout << "Fruit "
			<< std::endl;

		}

		void ripeTime() {
			std::cout << "You can eat it on " << 
			this->ripe << std::endl;
		} 
};
#endif