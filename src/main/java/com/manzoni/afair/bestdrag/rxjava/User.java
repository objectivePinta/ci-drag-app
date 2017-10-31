package com.manzoni.afair.bestdrag.rxjava;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class User extends Completable {
  String username;

  void setName(String name) {
    this.username = name;
  }

  @Override
  protected void subscribeActual(CompletableObserver completableObserver) {
    completableObserver.onComplete();
  }
}
