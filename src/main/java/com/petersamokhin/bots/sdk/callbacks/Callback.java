package com.petersamokhin.bots.sdk.callbacks;

/**
 * For all com.petersamokhin.bots.sdk.callbacks compatibility.
 */
public interface Callback<T> {

    void onResult(T object);
}
