#include <stdio.h>
#include <iostream>
#include <time.h>
#include "Apple.h"
#include "Food.h"
#include "Fruit.h"
#include "Orange.h"
#include "Tomato.h"
#include "Vegetable.h"

int main(){
	std::cout << "Tomato: " <<std::endl;

	Tomato *tom = new Tomato();

	tom->prepare();

	tom->ripeTime();

	tom->expireTime();
}