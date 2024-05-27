//============================================================================
// Name        : test.cpp
// Author      : Gavin Garcia
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <string.h>
#include <vector>
#include <array>
#include <algorithm>
#import "thing.h"
#include <fstream>
#include <array>

using namespace std;

int main() {
		string s = "LXXXIV";
		int currentNum;
	    int numSpots = 0;
	        for(int j = 0; j < s.length(); j++){
	            numSpots++;
	        }
	    int arr [numSpots];
	       for(int i = 0; i < s.length(); i++){

	           if(s[i] == 'I'){
	               currentNum = 1;
	           }
	           if(s[i] == 'V'){
	               currentNum = 5;
	           }
	           if(s[i] == 'X'){
	               currentNum = 10;
	           }
	           if(s[i] == 'L'){
	               currentNum = 50;
	           }
	           if(s[i] == 'C'){
	               currentNum = 100;
	           }
	           if(s[i] == 'D'){
	               currentNum = 500;
	           }
	           if(s[i] == 'M'){
	               currentNum = 1000;
	           }

	            arr[i] = currentNum;

	    }
	        int total = 0;
	        bool wasLess = false;
	        bool activate = false;
	        bool addEnd = true;
	        int arrSize = sizeof(arr)/sizeof(arr[0]);
	        for(int q = 0; q < arrSize - 1; q++){
	            if(wasLess == true){
	                activate = true;
	            }
	            if(wasLess == false){
	                if(arr[q] >= arr[q+1]){
	                    total += arr[q];
	                }
	                else{
	                    total += arr[q+1] - arr[q];
	                    wasLess = true;
	                }
	            }
	            if(activate == true){
	                wasLess = false;
	                activate = false;
	            }
	            if((arr[numSpots - 2]) < (arr[numSpots - 1])){
	            	addEnd = false;
	            }

	        }
	        if(addEnd == true){
	            total += arr[numSpots - 1];
	        }

	        cout << total;
}















