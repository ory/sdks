# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.35
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "ory-kratos-client"
VERSION = "v0.0.0-alpha.35"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Ory Kratos",
    author="OpenAPI Generator community",
    author_email="team@openapitools.org",
    url="https://github.com/ory/sdk",
    keywords=["OpenAPI", "OpenAPI-Generator", "Ory Kratos"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description="""\
    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501
    """
)
