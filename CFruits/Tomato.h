#ifndef TOMATO_H
#define TOMATO_H 
#include <time.h>
#include <string>

class Tomato:public Fruit, public Vegetable {
	// no data

	//methods:
public: 
	Tomato(){
		this->expiration = time(0);
		this->ripe = time(0);
		this->name = "tomato";

		std::cout << "Tomato " << std::endl;
	}
	Tomato(time_t e, time_t r, std::string n){
			this->expiration = e;
			this->name = n;
			this->ripe = r;
		}


};


#endif