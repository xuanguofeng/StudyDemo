package com.xuanguofeng.openframe.rxjava;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * description:
 * created time: 2018/3/8 14:17
 *
 * @author xuanguofeng
 */

public class RxJavaCreateDemo {


    /**
     * 创建观察者的方式
     */
    private Observable createObservable() {
        //创建观察者
        Observable observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("onNext1....");
                subscriber.onNext("onNext2....");
                subscriber.onCompleted();
            }
        });


        //通过just方法创建观察者
        Observable<String> just = Observable.just("onNext1", "onNext2");

        //通过from方法创建观察者
        String[] parameters = {"onNext1", "onNext2"};
        Observable<String> from = Observable.from(parameters);


        return observable;
    }


    /**
     * 创建被观察者的方式
     */
    private Observer createObsever() {
        Observer observer = new Observer() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }
        };
        return observer;
    }


    /**
     * 订阅
     */
    public void doRxjava() {
        createObservable().subscribe(createObsever());
    }

}
