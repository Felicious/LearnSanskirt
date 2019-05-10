#ifndef VEGETABLE_H
#define VEGETABLE_H 
#include <time.h>
#include <string>
#include <iostream>
#include "Food.h"

class Vegetable:public virtual Food {
	private: 
		time_t expiration;

	public: 
		Vegetable(){
			this->name = "veggie";
			this->expiration = time(0); //set exp to now
			
			std::cout <<  "Vegetable" << 
			std::endl;

		}

		Vegetable(time_t e, std::string n){
			this->expiration = e;
			this->name = n;
		}

		void expireTime() {
			std::cout << "Expires on " << 
			this->expiration << std::endl;
		}
};
#endif