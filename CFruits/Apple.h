#ifndef APPLE_H
#define APPLE_H 
#include <time.h>
#include <string>
#include <iostream>
#include "Fruit.h"

class Apple:public Fruit {
	public:
		Apple(time_t r): Fruit(r, "apple"){
			//Apple itself doesn't have a ripe
			//this->ripe = r;
			std::cout << "Apple" <<std::endl;

		}
		void prepare() {
			std::cout << "Core the " << this->name << std::endl;
		}
};
#endif