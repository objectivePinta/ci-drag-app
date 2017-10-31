package com.manzoni.afair.bestdrag.rxjava;

import io.reactivex.ObservableEmitter;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UserGenerator {

  private static User generateANewRandomUser() {
    return new User("a" + (new Random().nextInt(1000)));
  }

  public static void callOnNextAndGenerateAnUser(ObservableEmitter<User> emitter) {
    Thread t = new Thread(() -> {
      while (true) {
        emitter.onNext(generateANewRandomUser());
          try {
              TimeUnit.MILLISECONDS.sleep(new Random().nextInt(20));
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    });
    t.start();

  }

}
