import sys 

# импортируем нужные виджеты и элементы
from PySide6.QtWidgets import(
    QApplication,
    QWidget,
    QLabel, # текстовая метка
    QPushButton, # кнопка
    QVBoxLayout # контейнер для размещения виджетов
)

app = QApplication(sys.argv)

window = QWidget()
window.setWindowTitle("Окно с меткой QLabel")

# создание виджетов
label = QLabel("Приветствуем!")
button = QPushButton("Потыкать")

layout = QVBoxLayout()
# добавляем элементы на layout
layout.addWidget(label)
layout.addWidget(button)

# добавление созданного layout
window.setLayout(layout)
window.resize(400, 200)
window.show()
sys.exit(app.exec())