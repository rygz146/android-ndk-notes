/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.example.hellojni;

public class NativeJNI {
  public final static native long new_Shape__SWIG_0();
  public final static native long new_Shape__SWIG_1(double jarg1, double jarg2);
  public final static native void delete_Shape(long jarg1);
  public final static native void Shape_x_set(long jarg1, Shape jarg1_, double jarg2);
  public final static native double Shape_x_get(long jarg1, Shape jarg1_);
  public final static native void Shape_y_set(long jarg1, Shape jarg1_, double jarg2);
  public final static native double Shape_y_get(long jarg1, Shape jarg1_);
  public final static native long Shape_move(long jarg1, Shape jarg1_, double jarg2, double jarg3);
  public final static native String Shape_info(long jarg1, Shape jarg1_);
  public final static native double Shape_area(long jarg1, Shape jarg1_);
  public final static native double Shape_perimeter(long jarg1, Shape jarg1_);
  public final static native void Shape_methodWithDefaultArgs__SWIG_0(long jarg1, Shape jarg1_, int jarg2, float jarg3, String jarg4);
  public final static native void Shape_methodWithDefaultArgs__SWIG_1(long jarg1, Shape jarg1_, int jarg2, float jarg3);
  public final static native void Shape_methodWithDefaultArgs__SWIG_2(long jarg1, Shape jarg1_, int jarg2);
  public final static native void Shape_methodWithDefaultArgs__SWIG_3(long jarg1, Shape jarg1_);
  public final static native void Shape_methodOverloaded__SWIG_0(long jarg1, Shape jarg1_, int jarg2);
  public final static native void Shape_methodOverloaded__SWIG_1(long jarg1, Shape jarg1_, double jarg2);
  public final static native void Shape_methodOverloaded__SWIG_2(long jarg1, Shape jarg1_, String jarg2);
  public final static native void Shape_methodOverloaded__SWIG_3(long jarg1, Shape jarg1_, int jarg2, double jarg3, long jarg4);
  public final static native void Shape_nshapes_set(int jarg1);
  public final static native int Shape_nshapes_get();
  public final static native String Circle_info(long jarg1, Circle jarg1_);
  public final static native double Circle_area(long jarg1, Circle jarg1_);
  public final static native double Circle_perimeter(long jarg1, Circle jarg1_);
  public final static native void delete_Circle(long jarg1);
  public final static native String Square_info(long jarg1, Square jarg1_);
  public final static native double Square_area(long jarg1, Square jarg1_);
  public final static native double Square_perimeter(long jarg1, Square jarg1_);
  public final static native void delete_Square(long jarg1);
  public final static native int add(int jarg1, int jarg2);
  public final static native long new_MyClass__SWIG_0();
  public final static native long new_MyClass__SWIG_1(int jarg1);
  public final static native void delete_MyClass(long jarg1);
  public final static native String MyClass_show(long jarg1, MyClass jarg1_);
  public final static native long new_AsyncUidProvider();
  public final static native void delete_AsyncUidProvider(long jarg1);
  public final static native void AsyncUidProvider_getUid(long jarg1, AsyncUidProvider jarg1_);
  public final static native void AsyncUidProvider_onUid(long jarg1, AsyncUidProvider jarg1_, long jarg2);
  public final static native void AsyncUidProvider_onUidSwigExplicitAsyncUidProvider(long jarg1, AsyncUidProvider jarg1_, long jarg2);
  public final static native void AsyncUidProvider_director_connect(AsyncUidProvider obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void AsyncUidProvider_change_ownership(AsyncUidProvider obj, long cptr, boolean take_or_release);
  public final static native long getuid() throws java.lang.IllegalAccessException;
  public final static native long Circle_SWIGUpcast(long jarg1);
  public final static native long Square_SWIGUpcast(long jarg1);

  public static void SwigDirector_AsyncUidProvider_onUid(AsyncUidProvider jself, long uid) {
    jself.onUid(uid);
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
