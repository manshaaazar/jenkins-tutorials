const express = require("express");
const router = express.Router();
const redis = require("redis");
const client = redis.createClient({
  host: "redis-server",
  port: 6379
});
client.set("visits", 0);
/* GET users listing. */
router.get("/", function(req, res) {
  client.get("visits", (err, visits) => {
    res.send(`Number of visits ${visits}`);
    client.set("visits", parseInt(visits) + 1);
  });
});

module.exports = router;
