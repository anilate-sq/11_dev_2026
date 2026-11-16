# Команда для установки: pip install PySide6

from PySide6 import QtWidgets # подключаем PySide6
app = QtWidgets.QApplication([]) # создаем экземпляр класса QApplication(приложение)
window = QtWidgets.QWidget() # создаем экземпляр класса QWidget(окно)
window.setWindowTitle("Первое окно") # заголовок окна
window.show() # отображаем окно
app.exec() # запускаем цикл событий