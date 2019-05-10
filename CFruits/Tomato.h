#ifndef TOMATO_H
#define TOMATO_H 
#include <time.h>
#include <string>

class Tomato:public Fruit, public Vegetable {
	// no data

	//methods:
public: 
	Tomato(): Fruit(time(0), "tomato"), Vegetable(time(0), "tomato"){
		std::cout << "Tomato " << std::endl;
	}
	Tomato(time_t e, time_t r, std::string n):
	Fruit(r, "tomato"), Vegetable(e, "tomato"){
		std::cout << "Tomato " << std::endl;
	}


};


#endif