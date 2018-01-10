#!/usr/bin/env bash
mvn clean package
chmod +x test-app/bin/test-app
env LD_LIBRARY_PATH=test-app/bin test-app/bin/test-app
