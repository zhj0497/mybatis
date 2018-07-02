mainApp.controller('channel.list',
    function ($scope, $http, $location) {
        if ($scope.params == null) {
            $scope.params = {
                content: {
                    channelCode: "",
                    channelName: ""
                }
            }
        }
        $scope.toAdd = function () {
            window.location.href = "/channel/toFrom";
        }
        $scope.toUpdate = function (id) {
            window.location.href = "/channel/toFrom?id=" + id;
        }

        $scope.delete = function (id) {
            console.log("id:" + id);
            $http.get("/channel/delete", {
                params: {id: id}
            }).then(function (response) {
                console.log("response:" + angular.toJson(response.data));
                $scope.getPage();
                // location.reload();
            });
        }
        $scope.getPage = function () {
            var params = angular.toJson($scope.params);
            console.log("channel:" + params);
            if (params != undefined) {
                $http.post("/channel/list", params).then(function (response) {
                    $scope.pageInfo = response.data;
                });
            }
        }
        $scope.getPage();
    }
)