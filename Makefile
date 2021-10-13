install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates

lint:
	./gradlew checkstyleMain

build:
	./gradlew clean build

run:
	./gradlew run

test:
	./gradlew test

build-run: build run

.PHONY: build