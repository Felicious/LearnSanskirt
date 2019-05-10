#ifndef ORANGE_H
#define ORANGE_H 
#include <time.h>
#include <string>
#include <iostream>
#include "Fruit.h"


class Orange:public Fruit {
	public:
		Orange(time_t r): Fruit(r, "orange"){
			std::cout << "Orange" <<std::endl;

		}
		void prepare() {
			std::cout << "Peel the " << this->name << std::endl;
		}
};
#endif