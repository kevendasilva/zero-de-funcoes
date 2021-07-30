home
clear;

# Método da Bisseção # (1)
xNSBissecao = 1.001953;
itBissecao = [0.5 0.25 0.125 0.0625 0.0313 0.0156 0.0078 0.0039 0.0020];
sizeItBi = size(itBissecao)(2);

# Método de Newton-Raphson # (2)
xNSNewRap = 1.000031;
itNewRap = [0.6667 0.1333 0.0078 0.0000];
sizeItNewRap = size(itNewRap)(2);

# Método do Ponto fixo # (3)
xNSPonFi = 1.001540;
itPonFi = [0.4049 0.1584 0.0738 0.0337 0.0156 0.0072 0.0033 0.0015];
sizeItPonFi = size(itPonFi)(2);

# Método Regula Falsi # (4)
xNSRegFal = 0.998049;
itRegFal = [0.6667 0.4000 0.2222 0.1176 0.0606 0.0308 0.0155 0.0078 0.0039 0.0020];
sizeItRegFal = size(itRegFal)(2);

# Método da Secante # (5)
xNSSecante = 1.001029;
itSecante = [0.4000 0.1176 0.0187 0.0010];
sizeItSecante = size(itSecante)(2);

# Plotando gráfico de cada método

# (1)
coeffs1 = polyfit(1:sizeItBi, itBissecao, 5);
# Novo intervalo
t1 = 1:0.01:sizeItBi;
y_fit1 = polyval(coeffs1, t1);

figure()
hold on
plot(t1, y_fit1, 'g', 'linewidth', 2);
plot(1:sizeItBi, itBissecao, 'marker', 'o', 'markersize', 9, 'linestyle', 'none', "markerfacecolor", 'r', "markeredgecolor", 'none');
hold off
ylabel("ERR(n) - Erro Relativo Real", "fontweight", "b");
xlabel("n - número da iteração", "fontweight", "b");
title('Método da Bisseção');
legend('Ajuste','Erro Relativo Real');
grid on;

# (2)
coeffs2 = polyfit(1:sizeItNewRap, itNewRap, 3);
# Novo intervalo
t2 = 1:0.01:sizeItNewRap;
y_fit2 = polyval(coeffs2, t2);

figure()
hold on
plot(t2, y_fit2, 'g', 'linewidth', 2);
plot(1:sizeItNewRap, itNewRap, 'marker', 'o', 'markersize', 9, 'linestyle', 'none', "markerfacecolor", 'r', "markeredgecolor", 'none');
hold off
ylabel("ERR(n) - Erro Relativo Real", "fontweight", "b");
xlabel("n - número da iteração", "fontweight", "b");
legend('Ajuste','Erro Relativo Real');
title('Método de Newton-Raphson');
grid on;

# (3)
coeffs3 = polyfit(1:sizeItPonFi, itPonFi, 5);
# Novo intervalo
t3 = 1:0.01:sizeItPonFi;
y_fit3 = polyval(coeffs3, t3);

figure()
hold on
plot(t3, y_fit3, 'g', 'linewidth', 2);
plot(1:sizeItPonFi, itPonFi, 'marker', 'o', 'markersize', 9, 'linestyle', 'none', "markerfacecolor", 'r', "markeredgecolor", 'none');
hold off
ylabel("ERR(n) - Erro Relativo Real", "fontweight", "b");
xlabel("n - número da iteração", "fontweight", "b");
legend('Ajuste','Erro Relativo Real');
title('Método do Ponto Fixo');
grid on;

# (4)
coeffs = polyfit(1:sizeItRegFal, itRegFal, 5);
# Novo intervalo
t4 = 1:0.01:sizeItRegFal;
y_fit4 = polyval(coeffs4, t4);

figure()
hold on
plot(t4, y_fit4, 'g', 'linewidth', 2);
plot(1:sizeItRegFal, itRegFal, 'marker', 'o', 'markersize', 9, 'linestyle', 'none', "markerfacecolor", 'r', "markeredgecolor", 'none');
hold off
ylabel("ERR(n) - Erro Relativo Real", "fontweight", "b");
xlabel("n - número da iteração", "fontweight", "b");
title('Método Regula Falsi');
legend('Ajuste','Erro Relativo Real');
grid on;

# (5)
coeffs5 = polyfit(1:sizeItSecante, itSecante, 3);
# Novo intervalo
t5 = 1:0.01:sizeItSecante;
y_fit5 = polyval(coeffs5, t5);

figure()
hold on
plot(t5, y_fit5, 'g', 'linewidth', 2);
plot(1:sizeItSecante, itSecante, 'marker', 'o', 'markersize', 9, 'linestyle', 'none', "markerfacecolor", 'r', "markeredgecolor", 'none');
hold off
ylabel("ERR(n) - Erro Relativo Real", "fontweight", "b");
xlabel("n - número da iteração", "fontweight", "b");
title('Método da Secante');
legend('Ajuste','Erro Relativo Real');
grid on;




