package com.manzoni.afair.bestdrag.rxjava;

import io.reactivex.Completable;
import io.reactivex.Observable;

public interface UserManager {
  Observable<User> getUser();

  Completable setName(String username, Runnable callback);
}
