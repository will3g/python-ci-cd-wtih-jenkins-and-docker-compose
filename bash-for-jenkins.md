#!/bin/bash
export WORKSPACE=pwd
export PYTHONPATH=src

# Create/Activate virtualenv
virtualenv venv -p python3

source venv/bin/activate

# Install Requirements

pip install -r requirements.txt

# Run tests

python ./src/app.py