package com.manzoni.afair.bestdrag.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class RxJava {
  public static void main(String[] args) {

    // https://balamaci.github.io/rxjava-walkthrough/#hot-publishers
    // https://www.youtube.com/watch?v=htIXKI5gOQU
    // Flowable - Subscriber (has backpressure) vs Observable - Observer
    // BP -> allows you to control how fast a source emits items

    // fromCallable
    Observable<User> source = Observable.create(observableEmitter -> {
      UserGenerator.callOnNextAndGenerateAnUser(observableEmitter);
    });

    Observable<User> source2 = Observable.create(e -> {

    });

    Observer<User> o = new Observer<User>() {
      @Override
      public void onSubscribe(@NonNull Disposable disposable) {
        System.out.println("Subscribed");
      }

      @Override
      public void onNext(@NonNull User user) {
        System.out.println(user);
      }

      @Override
      public void onError(@NonNull Throwable throwable) {
        System.out.println("ERROR");
      }

      @Override
      public void onComplete() {
        System.out.println("complete");
      }
    };
    source.filter(t -> t.getUsername().contains("44")).subscribe(val -> System.out.println(val));
  }
}

// Single, Completable, Maybe