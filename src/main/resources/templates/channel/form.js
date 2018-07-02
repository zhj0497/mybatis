mainApp.controller('channel.form',
    function ($scope, $http, $location) {
        $scope.add = function () {
            var params = angular.toJson($scope.params);
            console.log("params:" + params);
            $http.post("/channel/save", params).then(function (response) {
                var tmp = angular.toJson(response.data)
                console.log("tmp:" + tmp);
                if ("SUCCESS" == response.data.status) {
                    alert("保存通道信息成功");
                    toList();
                } else {
                    alert("保存通道信信息失败," + response.data.msg);
                }
            });
        }
        $scope.update = function () {
            var params = angular.toJson($scope.params);
            console.log("params:" + params);
            $http.post("/channel/update", params).then(function (response) {
                var tmp = angular.toJson(response.data)
                console.log("tmp:" + tmp);
                if ("SUCCESS" == response.data.status) {
                    alert("更新通道信息成功");
                    toList();
                } else {
                    alert("更新通道信信息失败," + response.data.msg);
                }
            });
        }
        $scope.findOne = function (id) {
            console.log("id:" + id);
            $http.get("/channel/getOne?id=" + id).then(function (response) {
                var result = response.data;
                $scope.params = result;
            })
        }
        if ($location.search().id != null) {
            $scope.findOne($location.search().id);
            $scope.show_update = true;
        } else {
            $scope.show_add = true;
        }
    })


function toList() {
    window.location.href = "/channel";
}