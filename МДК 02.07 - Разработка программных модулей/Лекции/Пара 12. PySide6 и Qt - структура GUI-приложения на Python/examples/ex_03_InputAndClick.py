import sys

# импортируем нужные виджеты и элементы
from PySide6.QtWidgets import(
        QApplication,
        QWidget,
        QLabel, # текстовая метка
        QPushButton, # кнопка
        QVBoxLayout, # контейнер для размещения виджетов
        QLineEdit # input - поле для ввода
)

class MainWindow(QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Форма приветствия")
        self.resize(400, 200)

        # виджеты
        self.label = QLabel("Имя")
        self.input = QLineEdit() # поле для ввода
        self.input.setPlaceholderText("Введите имя") # подсказка в input
        self.button = QPushButton("Поздороваться")

        self.result = QLabel("") # сюда будем выводить результат нажатия

        # обработка события
        self.button.clicked.connect(self.hello)

        # размещение элементов
        layout = QVBoxLayout()
        layout.addWidget(self.label)
        layout.addWidget(self.input)
        layout.addWidget(self.button)
        layout.addWidget(self.result)

        self.setLayout(layout)


    # методы обрабатывающий нажатие на кнопку
    def hello(self):
        name = self.input.text() # получаем текст из input

        if name:
            self.result.setText(f"Привет, {name}")
        else:
            self.result.setText("Введите имя!")

app = QApplication(sys.argv)
window = MainWindow()
window.show()
sys.exit(app.exec())