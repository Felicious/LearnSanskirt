#ifndef ORANGE_H
#define ORANGE_H 
#include <time.h>
#include <string>
#include <iostream>

class Orange:public Fruit {
	public:
		Orange(time_t r){
			this->ripe = r;
			std::cout << "Orange" <<std::endl;

		}
		void prepare() {
			std::cout << "Peel the " << this->name << std::endl;
		}
}
#endif