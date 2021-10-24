install:	# очистка результатов предыдущей сборки
	./gradlew clean install

run-dist:	# запуск исполняемого файла
	./build/install/app/bin/app

check-updates:	# проверка обновления зависимостей и плагинов из 1го шага
	./gradlew dependencyUpdates

lint:	# проверка стиля кода
	./gradlew checkstyleMain

.PHONY: build
build:	# сборка проекта
	./gradlew clean build