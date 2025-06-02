package com.ejemplo;

public class CalculadoraDescuentos {
  private static final double MAX_PERCENTAGE = 100.0;
  public static double aplicarDescuentoPorcentaje(double monto, double porcentaje) {
    if (porcentaje > MAX_PERCENTAGE) {
      return 0;
    }
    return monto - (monto * porcentaje / MAX_PERCENTAGE);
  }
}
