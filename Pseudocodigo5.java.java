# Control de ingreso de nota1
nota1 = float(input("Ingrese la nota del primer parcial (0 a 10): "))

while nota1 < 0 or nota1 > 10:
    print("Nota invalida. Debe estar entre 0 y 10")
    nota1 = float(input("Ingrese nuevamente la nota del primer parcial: "))

# Control de ingreso de nota2
nota2 = float(input("Ingrese la nota del segundo parcial (0 a 10): "))

while nota2 < 0 or nota2 > 10:
    print("Nota invalida. Debe estar entre 0 y 10")
    nota2 = float(input("Ingrese nuevamente la nota del segundo parcial: "))

# Control de ingreso de nota3
nota3 = float(input("Ingrese la nota del tercer parcial (0 a 10): "))

while nota3 < 0 or nota3 > 10:
    print("Nota invalida. Debe estar entre 0 y 10")
    nota3 = float(input("Ingrese nuevamente la nota del tercer parcial: "))

# Calculo del promedio ponderado
promedio = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40)

print("El promedio final es:", promedio)

# Control de aprobacion
if promedio >= 7:
    print("El estudiante aprueba la asignatura")
else:
    print("El estudiante no aprueba la asignatura")