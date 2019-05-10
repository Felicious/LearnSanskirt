#ifndef APPLE_H
#define APPLE_H 
#include <time.h>
#include <string>
#include <iostream>

class Apple:public Fruit {
	public:
		Apple(time_t r){
			this->ripe = r;
			std::cout << "Apple" <<std::endl;

		}
		void prepare() {
			std::cout << "Core the " << this->name << std::endl;
		}
}
#endif