package com.jdc.mkt.seal;

//can't use from different pkg A class
public sealed interface Cashier permits Staff,Employee{

}
