
#include <jni.h>
#include <string>
#include<iostream>
#include <algorithm>
#include <cstring>
#include <memory.h>
#include "MD5.h"
#include "cmath"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


char *a = const_cast<char *>("a");
char *b = const_cast<char *>("b");
char *c = const_cast<char *>("c");
char *d = const_cast<char *>("d");
char *e = const_cast<char *>("e");
char *f = const_cast<char *>("f");
char *g = const_cast<char *>("g");
char *x = const_cast<char *>("x");
char *y = const_cast<char *>("y");
char *z = const_cast<char *>("z");
char *i1 = const_cast<char *>("1");
char *i2 = const_cast<char *>("2");
char *i3 = const_cast<char *>("3");
char *i4 = const_cast<char *>("4");
char *i5 = const_cast<char *>("5");
char *i6 = const_cast<char *>("6");
char *i7 = const_cast<char *>("7");
char *i8 = const_cast<char *>("8");
char *i9 = const_cast<char *>("9");
char *i0 = const_cast<char *>("0");


std::string &getKey(std::string &value);


std::string &getKey(std::string &value) {
    value += i1;
    value += i2;
    value += i3;
    value += i4;
    value += i5;
    value += i6;
    return value;
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_xuanguofeng_jniutils_JNIUtils_getSign(JNIEnv *env, jclass type) {
    std::string text;
    text = getKey(text);
    MD5 md5 = MD5(text);
    std::string md5Result = md5.hexdigest();
    return env->NewStringUTF(md5Result.c_str());
}
